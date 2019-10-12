import com.github.sarxos.xchange.ExchangeException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {

    public TextField gbpInput;

    public Text eurResult;

    public Text usdResult;

    @FXML
    protected void convertCurrency(ActionEvent event){
        if(!gbpInput.getText().isEmpty()) {
            double gbpInputDouble = Double.parseDouble(gbpInput.getText());
            try {
                eurResult.setText(CurrencyUtils.toEUR(gbpInputDouble).floatValue() + "");
                usdResult.setText(CurrencyUtils.toUSD(gbpInputDouble).floatValue() + "");
            } catch (ExchangeException e) {
                e.printStackTrace();
            }
        }
    }
}
