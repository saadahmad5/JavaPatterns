package StructuralPatterns.BridgePattern.UIComponents;

public class CheckboxComponent extends Component {

    CheckboxComponent(ComponentSize componentSize) {
        this.componentSize = componentSize;
    }

    @Override
    public void getComponentNameAndSize() {
        System.out.println("Checkbox");
        System.out.println(componentSize.getSize());
    }
}
