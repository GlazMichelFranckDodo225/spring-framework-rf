package com.dgmf.WhenUseSetterBasedDependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;

class DependencyA {

}

class DependencyB {

}

class DependencyC {

}

/* First, we need to create a Spring Bean for this Class, and
use setters to inject Dependencies after the creation of the
Spring Bean */
public class WhenUseSetterBasedDependencyInjection {
    // These following dependencies are Optional
    private DependencyA dependencyA;
    private DependencyB dependencyB;
    private DependencyC dependencyC;

    @Autowired
    public void setDependencyA(DependencyA dependencyA) {
        this.dependencyA = dependencyA;
    }

    @Autowired
    public void setDependencyB(DependencyB dependencyB) {
        this.dependencyB = dependencyB;
    }

    @Autowired
    public void setDependencyC(DependencyC dependencyC) {
        this.dependencyC = dependencyC;
    }
}
