package StructuralPatterns.BridgePattern.UIComponents;

public class Main {

    public static void main(String[] args) {

        // Radio Components

        RadioComponent smallRadioComponent = new RadioComponent(new SmallComponentSize());
        smallRadioComponent.getComponentNameAndSize();

        RadioComponent mediumRadioComponent = new RadioComponent(new MediumComponentSize());
        mediumRadioComponent.getComponentNameAndSize();

        RadioComponent largeRadioComponent = new RadioComponent(new LargeComponentSize());
        largeRadioComponent.getComponentNameAndSize();

        // Checkbox Components

        CheckboxComponent smallCheckboxComponent = new CheckboxComponent(new SmallComponentSize());
        smallCheckboxComponent.getComponentNameAndSize();

        CheckboxComponent mediumCheckboxComponent = new CheckboxComponent(new MediumComponentSize());
        mediumCheckboxComponent.getComponentNameAndSize();

        CheckboxComponent largeCheckboxComponent = new CheckboxComponent(new LargeComponentSize());
        largeCheckboxComponent.getComponentNameAndSize();

        // Dropdown Components

        DropdownComponent smallDropdownComponent = new DropdownComponent(new SmallComponentSize());
        smallDropdownComponent.getComponentNameAndSize();

        DropdownComponent mediumDropdownComponent = new DropdownComponent(new MediumComponentSize());
        mediumDropdownComponent.getComponentNameAndSize();

        DropdownComponent largeDropdownComponent = new DropdownComponent(new LargeComponentSize());
        largeDropdownComponent.getComponentNameAndSize();

    }

}
