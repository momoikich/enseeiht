/**
 * generated by Xtext 2.23.0
 */
package fr.n7.tests;

import com.google.inject.Inject;
import fr.n7.tests.GAMEInjectorProvider;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(GAMEInjectorProvider.class)
@SuppressWarnings("all")
public class GAMEParsingTest {
  @Inject
  private /* ParseHelper<Game> */Object parseHelper;
  
  @Test
  public void loadModel() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field GAMEParsingTest.parseHelper refers to the missing type Game"
      + "\neResource cannot be resolved"
      + "\nerrors cannot be resolved"
      + "\nisEmpty cannot be resolved"
      + "\njoin cannot be resolved");
  }
}