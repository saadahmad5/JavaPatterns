package StructuralPatterns.BridgePattern.UIComponents;

public class RadioComponent extends Component {

    RadioComponent(ComponentSize componentSize) { this.componentSize = componentSize; }

    @Override
    public void getComponentNameAndSize() {
        System.out.println("Radio");
        System.out.println(componentSize.getSize());
    }

}
