package StructuralPatterns.BridgePattern.UIComponents;

public class LargeComponentSize implements ComponentSize {

    ComponentSizes componentSize;

    LargeComponentSize() {
        setSize();
    }

    @Override
    public ComponentSizes getSize() {
        return componentSize;
    }

    @Override
    public void setSize() {
        componentSize = ComponentSizes.LARGE;
    }
}
