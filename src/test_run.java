import static org.junit.Assert.*;

import org.junit.Test;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/* Junit test suite class */
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({vulture_bite_test.class,cricket_bite_test.class,trampoline_exception.class,snake_bite_test.class})

public class test_run {
public static void main(String[] args) {


Result result1= JUnitCore.runClasses(vulture_bite_test.class);

System.out.println(result1.wasSuccessful());

Result result2= JUnitCore.runClasses(cricket_bite_test.class);

System.out.println(result1.wasSuccessful());

Result result3= JUnitCore.runClasses(snake_bite_test.class);

System.out.println(result1.wasSuccessful());

Result result4= JUnitCore.runClasses(trampoline_exception.class);

System.out.println(result1.wasSuccessful());
}
}