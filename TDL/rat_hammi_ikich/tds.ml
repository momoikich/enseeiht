open Hashtbl
open Type

(* Données stockées dans la tds  et dans les AST : pointeur sur une information *)
(* Définition du type des informations associées aux identifiants *)
type info_ast = info ref and info =
  | InfoConst of string * int
  | InfoVar of string * typ *string* int * string
  | InfoType of string * typ
  | InfoStruct of string * (typ*info_ast) list * int * string
  | InfoFun of string * typ * typ list

(* Table des symboles hiérarchique *)
(* Les tables locales sont codées à l'aide d'une hashtable *)
type tds =
  | Nulle
  (* Table courante : la table mère - la table courante *)
  | Courante of tds * (string,info_ast) Hashtbl.t


(* Créer une information à associer à l'AST à partir d'une info *)
let info_to_info_ast i = ref i

(* Récupère l'information associée à un noeud *)
let info_ast_to_info i = !i

(* Création d'une table des symboles à la racine *)
let creerTDSMere () = Courante (Nulle, Hashtbl.create 100)

(* Création d'une table des symboles fille *)
(* Le paramètre est la table mère *)
let creerTDSFille mere = Courante (mere, Hashtbl.create 100)


(* Ajoute une information dans la table des symboles locale *)
(* tds : la tds courante *)
(* string : le nom de l'identificateur *)
(* info : l'information à associer à l'identificateur *)
(* Si l'identificateur est déjà présent dans TDS, l'information est écrasée *)
(* retour : unit *)
let ajouter tds nom info =
  match tds with
  | Nulle -> failwith "Ajout dans une table vide"
  | Courante (_,c) -> Hashtbl.add c nom info

(* Recherche les informations d'un identificateur dans la tds locale *)
(* Ne cherche que dans la tds de plus bas niveau *)
let chercherLocalement tds nom =
  match tds with
  | Nulle -> None
  | Courante (_,c) ->  find_opt c nom 

(* TESTS *)
let%test _ = chercherLocalement (creerTDSMere()) "x" = None
let%test _ = 
  let tds = creerTDSMere() in
  let ix = info_to_info_ast (InfoVar ("x", Rat,"",0, "SB")) in
  let iy = info_to_info_ast (InfoVar ("y", Int,"", 2, "SB")) in
  ajouter tds "x" ix;
  ajouter tds "y" iy;
  chercherLocalement tds "x" = Some ix
let%test _ = 
    let tds = creerTDSMere() in
    let ix = info_to_info_ast (InfoVar ("x", Rat,"", 0, "SB")) in
    let iy = info_to_info_ast (InfoVar ("y", Int,"", 2, "SB")) in
    ajouter tds "x" ix;
    ajouter tds "y" iy;
    chercherLocalement tds "y" = Some iy
let%test _ = 
    let tds = creerTDSMere() in
    let ix = info_to_info_ast (InfoVar ("x", Rat,"", 0, "SB")) in
    let iy = info_to_info_ast (InfoVar ("y", Int,"",2, "SB")) in
    ajouter tds "x" ix;
    ajouter tds "y" iy;
    chercherLocalement tds "z" = None
let%test _ = 
  let tds = creerTDSMere() in
  let ix = info_to_info_ast (InfoVar ("x", Rat,"", 0, "SB")) in
  let iy = info_to_info_ast (InfoVar ("y", Int,"", 2, "SB")) in
  ajouter tds "x" ix;
  ajouter tds "y" iy;
  let tdsf = creerTDSFille(tds) in
  let ix2 = info_to_info_ast (InfoVar ("x", Bool,"", 3, "LB")) in
  let iz = info_to_info_ast (InfoVar ("z", Rat,"", 4, "LB")) in
  ajouter tdsf "x" ix2;
  ajouter tdsf "z" iz;
  chercherLocalement tds "x" = Some ix
let%test _ = 
    let tds = creerTDSMere() in
    let ix = info_to_info_ast (InfoVar ("x", Rat,"", 0, "SB")) in
    let iy = info_to_info_ast (InfoVar ("y", Int,"", 2, "SB")) in
    ajouter tds "x" ix;
    ajouter tds "y" iy;
    let tdsf = creerTDSFille(tds) in
    let ix2 = info_to_info_ast (InfoVar ("x", Bool,"", 3, "LB")) in
    let iz = info_to_info_ast (InfoVar ("z", Rat,"", 4, "LB")) in
    ajouter tdsf "x" ix2;
    ajouter tdsf "z" iz;
    chercherLocalement tds "y" = Some iy
let%test _ = 
    let tds = creerTDSMere() in
    let ix = info_to_info_ast (InfoVar ("x", Rat,"", 0, "SB")) in
    let iy = info_to_info_ast (InfoVar ("y", Int,"", 2, "SB")) in
    ajouter tds "x" ix;
    ajouter tds "y" iy;
    let tdsf = creerTDSFille(tds) in
    let ix2 = info_to_info_ast (InfoVar ("x", Bool,"", 3, "LB")) in
    let iz = info_to_info_ast (InfoVar ("z", Rat,"", 4, "LB")) in
    ajouter tdsf "x" ix2;
    ajouter tdsf "z" iz;
    chercherLocalement tds "z" = None
let%test _ = 
    let tds = creerTDSMere() in
    let ix = info_to_info_ast (InfoVar ("x", Rat,"", 0, "SB")) in
    let iy = info_to_info_ast (InfoVar ("y", Int,"", 2, "SB")) in
    ajouter tds "x" ix;
    ajouter tds "y" iy;
    let tdsf = creerTDSFille(tds) in
    let ix2 = info_to_info_ast (InfoVar ("x", Bool,"", 3, "LB")) in
    let iz = info_to_info_ast (InfoVar ("z", Rat,"", 4, "LB")) in
    ajouter tdsf "x" ix2;
    ajouter tdsf "z" iz;
    chercherLocalement tdsf "y" = None
let%test _ = 
    let tds = creerTDSMere() in
    let ix = info_to_info_ast (InfoVar ("x", Rat,"", 0, "SB")) in
    let iy = info_to_info_ast (InfoVar ("y", Int,"", 2, "SB")) in
    ajouter tds "x" ix;
    ajouter tds "y" iy;
    let tdsf = creerTDSFille(tds) in
    let ix2 = info_to_info_ast (InfoVar ("x", Bool,"", 3, "LB")) in
    let iz = info_to_info_ast (InfoVar ("z", Rat,"", 4, "LB")) in
    ajouter tdsf "x" ix2;
    ajouter tdsf "z" iz;
    chercherLocalement tdsf "x" = Some ix2
let%test _ = 
    let tds = creerTDSMere() in
    let ix = info_to_info_ast (InfoVar ("x", Rat, "",0, "SB")) in
    let iy = info_to_info_ast (InfoVar ("y", Int, "",2, "SB")) in
    ajouter tds "x" ix;
    ajouter tds "y" iy;
    let tdsf = creerTDSFille(tds) in
    let ix2 = info_to_info_ast (InfoVar ("x", Bool, "",3, "LB")) in
    let iz = info_to_info_ast (InfoVar ("z", Rat, "",4, "LB")) in
    ajouter tdsf "x" ix2;
    ajouter tdsf "z" iz;
    chercherLocalement tdsf "z" = Some iz
let%test _ = 
    let tds = creerTDSMere() in
    let ix = info_to_info_ast (InfoVar ("x", Rat, "",0, "SB")) in
    let iy = info_to_info_ast (InfoVar ("y", Int, "",2, "SB")) in
    ajouter tds "x" ix;
    ajouter tds "y" iy;
    let tdsf = creerTDSFille(tds) in
    let ix2 = info_to_info_ast (InfoVar ("x", Bool, "",3, "LB")) in
    let iz = info_to_info_ast (InfoVar ("z", Rat, "",4, "LB")) in
    ajouter tdsf "x" ix2;
    ajouter tdsf "z" iz;
    chercherLocalement tdsf "a" = None

(* Recherche les informations d'un identificateur dans la tds globale *)
(* Si l'identificateur n'est pas présent dans la tds de plus bas niveau *)
(* la recherche est effectuée dans sa table mère et ainsi de suite *)
(* jusqu'à trouver (ou pas) l'identificateur *)
let rec chercherGlobalement tds nom =
  match tds with
  | Nulle -> None
  | Courante (m,c) ->
    match find_opt c nom with
      | Some _ as i -> i
      | None -> chercherGlobalement m nom

(* TESTS *)

let%test _ = chercherGlobalement (creerTDSMere()) "x" = None
let%test _ = 
  let tds = creerTDSMere() in
  let ix = info_to_info_ast (InfoVar ("x", Rat,"", 0, "SB")) in
  let iy = info_to_info_ast (InfoVar ("y", Int,"", 2, "SB")) in
  ajouter tds "x" ix;
  ajouter tds "y" iy;
  chercherGlobalement tds "x" = Some ix
let%test _ = 
    let tds = creerTDSMere() in
    let ix = info_to_info_ast (InfoVar ("x", Rat,"", 0, "SB")) in
    let iy = info_to_info_ast (InfoVar ("y", Int,"", 2, "SB")) in
    ajouter tds "x" ix;
    ajouter tds "y" iy;
    chercherGlobalement tds "y" = Some iy
let%test _ = 
    let tds = creerTDSMere() in
    let ix = info_to_info_ast (InfoVar ("x", Rat,"", 0, "SB")) in
    let iy = info_to_info_ast (InfoVar ("y", Int,"", 2, "SB")) in
    ajouter tds "x" ix;
    ajouter tds "y" iy;
    chercherGlobalement tds "z" = None
let%test _ = 
  let tds = creerTDSMere() in
  let ix = info_to_info_ast (InfoVar ("x", Rat,"", 0, "SB")) in
  let iy = info_to_info_ast (InfoVar ("y", Int,"", 2, "SB")) in
  ajouter tds "x" ix;
  ajouter tds "y" iy;
  let tdsf = creerTDSFille(tds) in
  let ix2 = info_to_info_ast (InfoVar ("x", Bool,"", 3, "LB")) in
  let iz = info_to_info_ast (InfoVar ("z", Rat,"", 4, "LB")) in
  ajouter tdsf "x" ix2;
  ajouter tdsf "z" iz;
  chercherGlobalement tds "x" = Some ix
let%test _ = 
    let tds = creerTDSMere() in
    let ix = info_to_info_ast (InfoVar ("x", Rat,"", 0, "SB")) in
    let iy = info_to_info_ast (InfoVar ("y", Int,"", 2, "SB")) in
    ajouter tds "x" ix;
    ajouter tds "y" iy;
    let tdsf = creerTDSFille(tds) in
    let ix2 = info_to_info_ast (InfoVar ("x", Bool,"", 3, "LB")) in
    let iz = info_to_info_ast (InfoVar ("z", Rat,"", 4, "LB")) in
    ajouter tdsf "x" ix2;
    ajouter tdsf "z" iz;
    chercherGlobalement tds "y" = Some iy
let%test _ = 
    let tds = creerTDSMere() in
    let ix = info_to_info_ast (InfoVar ("x", Rat,"", 0, "SB")) in
    let iy = info_to_info_ast (InfoVar ("y", Int,"", 2, "SB")) in
    ajouter tds "x" ix;
    ajouter tds "y" iy;
    let tdsf = creerTDSFille(tds) in
    let ix2 = info_to_info_ast (InfoVar ("x", Bool,"", 3, "LB")) in
    let iz = info_to_info_ast (InfoVar ("z", Rat,"", 4, "LB")) in
    ajouter tdsf "x" ix2;
    ajouter tdsf "z" iz;
    chercherGlobalement tds "z" = None
let%test _ = 
    let tds = creerTDSMere() in
    let ix = info_to_info_ast (InfoVar ("x", Rat,"", 0, "SB")) in
    let iy = info_to_info_ast (InfoVar ("y", Int,"", 2, "SB")) in
    ajouter tds "x" ix;
    ajouter tds "y" iy;
    let tdsf = creerTDSFille(tds) in
    let ix2 = info_to_info_ast (InfoVar ("x", Bool,"", 3, "LB")) in
    let iz = info_to_info_ast (InfoVar ("z", Rat,"", 4, "LB")) in
    ajouter tdsf "x" ix2;
    ajouter tdsf "z" iz;
    chercherGlobalement tdsf "y" = Some iy
let%test _ = 
    let tds = creerTDSMere() in
    let ix = info_to_info_ast (InfoVar ("x", Rat,"", 0, "SB")) in
    let iy = info_to_info_ast (InfoVar ("y", Int,"", 2, "SB")) in
    ajouter tds "x" ix;
    ajouter tds "y" iy;
    let tdsf = creerTDSFille(tds) in
    let ix2 = info_to_info_ast (InfoVar ("x", Bool,"", 3, "LB")) in
    let iz = info_to_info_ast (InfoVar ("z", Rat,"", 4, "LB")) in
    ajouter tdsf "x" ix2;
    ajouter tdsf "z" iz;
    chercherGlobalement tdsf "x" = Some ix2
let%test _ = 
    let tds = creerTDSMere() in
    let ix = info_to_info_ast (InfoVar ("x", Rat,"", 0, "SB")) in
    let iy = info_to_info_ast (InfoVar ("y", Int,"", 2, "SB")) in
    ajouter tds "x" ix;
    ajouter tds "y" iy;
    let tdsf = creerTDSFille(tds) in
    let ix2 = info_to_info_ast (InfoVar ("x", Bool,"", 3, "LB")) in
    let iz = info_to_info_ast (InfoVar ("z", Rat,"", 4, "LB")) in
    ajouter tdsf "x" ix2;
    ajouter tdsf "z" iz;
    chercherGlobalement tdsf "z" = Some iz
let%test _ = 
    let tds = creerTDSMere() in
    let ix = info_to_info_ast (InfoVar ("x", Rat,"", 0, "SB")) in
    let iy = info_to_info_ast (InfoVar ("y", Int,"", 2, "SB")) in
    ajouter tds "x" ix;
    ajouter tds "y" iy;
    let tdsf = creerTDSFille(tds) in
    let ix2 = info_to_info_ast (InfoVar ("x", Bool,"", 3, "LB")) in
    let iz = info_to_info_ast (InfoVar ("z", Rat,"", 4, "LB")) in
    ajouter tdsf "x" ix2;
    ajouter tdsf "z" iz;
    chercherGlobalement tdsf "a" = None


(* Convertie une info en une chaine de caractère - pour affichage *)
let rec string_of_info info =
  match info with
  | InfoConst (n,value) -> "Constante "^n^" : "^(string_of_int value)
  | InfoType(n,t) -> "Type nommé : "^n^" de type : "^(string_of_type t)
  | InfoStruct (n,lp,dep,base) -> "Enregistrement "^n^" :"^List.fold_left (fun acc (t,x) -> acc ^" "^(string_of_type t)^" "^(string_of_info (info_ast_to_info x)))"" lp^", "^(string_of_int dep)^"["^base^"]"
  | InfoVar (n,t,s,dep,base) -> "Variable "^n^" : "^(string_of_type t)^" associé au struct "^s^", "^(string_of_int dep)^"["^base^"]"
  | InfoFun (n,t,tp) -> "Fonction "^n^" : "^(List.fold_right (fun elt tq -> if tq = "" then (string_of_type elt) else (string_of_type elt)^" * "^tq) tp "" )^
                      " -> "^(string_of_type t)

(* Affiche la tds locale *)
let afficher_locale tds =
  match tds with
  | Nulle -> print_newline ()
  |Courante (_,c) -> Hashtbl.iter ( fun n info -> (print_string (n^" : "^(string_of_info (info_ast_to_info info))^"\n"))) c

(* Affiche la tds locale et récursivement *)
let afficher_globale tds =
  let rec afficher tds indent =
    match tds with
    | Nulle -> print_newline ()
    | Courante (m,c) -> if Hashtbl.length c = 0
                        then print_string (indent^"<empty>\n")
                        else Hashtbl.iter ( fun n info -> (print_string (indent^n^" : "^(string_of_info (info_ast_to_info info))^"\n"))) c ; afficher m (indent^"  ")
  in afficher tds ""

(* Modifie le type si c'est une InfoVar, InfoType ou InfoStruct, ne fait rien sinon *)
  let rec modifier_type_info t i =
    match !i with
    |InfoVar (n,_,st_cor,dep,base) -> i:= InfoVar (n,t,st_cor,dep,base)
    |InfoType (n,_) -> i:= InfoType (n,t)
    |InfoStruct (n,lp,dep,base) -> let nlp = List.map (fun (t,info) -> modifier_type_info t info; (t,info)) lp in
                              i:= InfoStruct (n,nlp,dep,base)
    | _ -> failwith "Appel modifier_type_info pas sur un InfoVar, InfoType ou InfoStruct"

(* Modifie le struct auquel est associé une variable *)
let modifier_struct_var_info s i =
      match !i with
      |InfoVar (n,t,_,dep,base) -> i:= InfoVar (n,t,s,dep,base)
      | _ -> failwith "Appel modifier_struct_var_info pas sur un InfoVar"
  
let%test _ = 
  let info = InfoVar ("x", Undefined,"", 4 , "SB") in
  let ia = info_to_info_ast info in
  modifier_type_info Rat ia;
  match info_ast_to_info ia with
  | InfoVar ("x", Rat,"", 4 , "SB") -> true
  | _ -> false
 
(* Modifie les types de retour et des paramètres si c'est une InfoFun, ne fait rien sinon *)
 let modifier_type_fonction_info t tp i =
       match !i with
       |InfoFun(n,_,_) -> i:= InfoFun(n,t,tp)
       | _ -> failwith "Appel modifier_type_fonction_info pas sur un InfoFun"

let%test _ = 
  let info = InfoFun ("f", Undefined, []) in
  let ia = info_to_info_ast info in
  modifier_type_fonction_info Rat [Int ; Int] ia;
  match info_ast_to_info ia with
  | InfoFun ("f", Rat, [Int ; Int]) -> true
  | _ -> false
 
(* Modifie l'emplacement (dépl, registre) si c'est une InfoVar ou InfoStruct, ne fait rien sinon *)
 let rec modifier_adresse_info d b i =
     match !i with
     |InfoVar (n,t,s,_,_) -> i:= InfoVar (n,t,s,d,b)
     |InfoStruct (n,lp,_,_) -> List.fold_left (fun base (t,info) -> modifier_adresse_info base b info; base + (getTaille t)) d lp |> ignore;
                i:= InfoStruct (n,lp,d,b)
     | _ -> failwith "Appel modifier_adresse_info pas sur un InfoVar ou un InfoStruct"

let%test _ = 
  let info = InfoVar ("x", Rat,"", 4 , "SB") in
  let ia = info_to_info_ast info in
  modifier_adresse_info 10 "LB" ia;
  match info_ast_to_info ia with
  | InfoVar ("x", Rat,"", 10 , "LB") -> true
  | _ -> false
    