package com.dgmf.whenuseconstructorbaseddependencyinjection;

class DependencyA {

}

class DependencyB {

}

class DependencyC {

}

public class WhenUseConstructorBasedDependencyInjection {
    // These following dependencies are required
    private DependencyA dependencyA;
    private DependencyB dependencyB;
    private DependencyC dependencyC;

    public WhenUseConstructorBasedDependencyInjection(
            DependencyA dependencyA,
            DependencyB dependencyB,
            DependencyC dependencyC
    ) {
        this.dependencyA = dependencyA;
        this.dependencyB = dependencyB;
        this.dependencyC = dependencyC;
    }
}
