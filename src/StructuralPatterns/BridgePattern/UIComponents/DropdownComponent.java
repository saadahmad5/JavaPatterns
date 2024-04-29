package StructuralPatterns.BridgePattern.UIComponents;

public class DropdownComponent extends Component {

    DropdownComponent(ComponentSize componentSize) {
        this.componentSize = componentSize;
    }

    @Override
    public void getComponentNameAndSize() {
        System.out.println("Dropdown");
        System.out.println(componentSize.getSize());
    }
}
