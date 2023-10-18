package com.dgmf.WhenUseSetterBasedDependencyInjection.circulardependencies;

import org.springframework.beans.factory.annotation.Autowired;

class DependencyA {
    private DependencyB dependencyB;

    /*public DependencyA(DependencyB dependencyB) {
        this.dependencyB = dependencyB;
    }*/

    // Use Setter Dependency Injection rather than Constructor
    // Dependency Injection because of CIRCULAR DEPENDENCIES
    // A -> B and B -> A
    @Autowired
    public void setDependencyB(DependencyB dependencyB) {
        this.dependencyB = dependencyB;
    }
}

class DependencyB {
    private DependencyA dependencyA;

    /*public DependencyB(DependencyA dependencyA) {
        this.dependencyA = dependencyA;
    }*/

    // Use Setter Dependency Injection rather than Constructor
    // Dependency Injection because of CIRCULAR DEPENDENCIES
    // A -> B and B -> A
    @Autowired
    public void setDependencyA(DependencyA dependencyA) {
        this.dependencyA = dependencyA;
    }
}

class DependencyC {

}

public class CircularDependencies {
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
