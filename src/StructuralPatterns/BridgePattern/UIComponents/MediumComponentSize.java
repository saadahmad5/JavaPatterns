package StructuralPatterns.BridgePattern.UIComponents;

public class MediumComponentSize implements ComponentSize {

    ComponentSizes componentSize;

    MediumComponentSize() {
        setSize();
    }

    @Override
    public ComponentSizes getSize() {
        return componentSize;
    }

    @Override
    public void setSize() {
        componentSize = ComponentSizes.MEDIUM;
    }
}
