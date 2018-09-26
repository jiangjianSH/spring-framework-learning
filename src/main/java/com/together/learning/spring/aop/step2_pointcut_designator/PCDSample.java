package com.together.learning.spring.aop.step2_pointcut_designator;

import com.together.learning.spring.aop.step2_pointcut_designator.subpackag1.B;
import com.together.learning.spring.aop.step2_pointcut_designator.subpackag1.sbupackage1_1.C;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jiangjian
 */
public class PCDSample {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        A a = ac.getBean(A.class);
        a.add(1, 2);

        B b = ac.getBean(B.class);
        b.display();

        C c = ac.getBean(C.class);
        c.display();

        D d = ac.getBean(D.class);
        d.display();

        Display e = ac.getBean(Display.class);
        e.display();

        F f = ac.getBean(F.class);
        f.display(new Storage());

        f.display(new Object());

        f.display("jiangjian", new Storage());

        G g = ac.getBean(G.class);
        g.display();

        H h = ac.getBean(H.class);
        h.display();

        I i = ac.getBean(I.class);
        i.display();

        J j = ac.getBean(J.class);
        j.display(new User("jiangjian"));

        K k = ac.getBean(K.class);
        k.display();
    }
}
