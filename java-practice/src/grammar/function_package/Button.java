package grammar.function_package;

public class Button {
    private String text;
    private Runnable onClickListener;


    public Button(String text) {
        this.text = text;
    }

    public void setOnClickListener(Runnable onClickListener){
        this.onClickListener = onClickListener;
    }

    public String getText() {
        return text;
    }


    public void onClick(){
        onClickListener.run();
    }
}
