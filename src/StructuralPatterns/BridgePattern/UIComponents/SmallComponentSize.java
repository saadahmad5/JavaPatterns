package StructuralPatterns.BridgePattern.UIComponents;

public class SmallComponentSize implements ComponentSize {

    ComponentSizes componentSize;

    SmallComponentSize() {
        setSize();
    }

    @Override
    public ComponentSizes getSize() {
        return componentSize;
    }

    @Override
    public void setSize() { componentSize = ComponentSizes.SMALL; }
}
