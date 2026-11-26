package tasks.buttonComponents;

public class Button {
    private String name;
    private ClickListener action;

    public Button(String name) {
        this.name = name;
    }

    public void setClickListener(){
        Button.this.action = new ClickListener() {
            @Override
            public void onClick() {
                System.out.printf("%s has been clicked.", Button.this.name);
            }
        };
    }

    public void click(){
        this.action.onClick();
    }
}
