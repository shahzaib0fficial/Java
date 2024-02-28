import Classes.Product;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class c15Table extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Table");

        TableColumn<Product,String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));


        TableColumn<Product,Integer> ammountColumn = new TableColumn<>("Ammount");
        ammountColumn.setMinWidth(100);
        ammountColumn.setCellValueFactory(new PropertyValueFactory<>("ammount"));

        TableColumn<Product,Double> ratingColumn = new TableColumn<>("Rating");
        ratingColumn.setMinWidth(50);
        ratingColumn.setCellValueFactory(new PropertyValueFactory<>("rating"));
        
        TableView<Product> tableView = new TableView<>();
        tableView.setItems(getProducts());
        tableView.getColumns().add(nameColumn);
        tableView.getColumns().add(ammountColumn);
        tableView.getColumns().add(ratingColumn);
        
        TextField nameField = new TextField();
        nameField.setPromptText("Name...");
        
        TextField ammountField = new TextField();
        ammountField.setPromptText("Ammount...");
        
        TextField ratingField = new TextField();
        ratingField.setPromptText("Rating...");

        Button addButton = new Button("Add");
        addButton.setOnAction(e->{
            Product product = new Product();
            product.setName(nameField.getText());
            product.setAmmount(Integer.parseInt(ammountField.getText()));
            product.setRating(Double.parseDouble(ratingField.getText()));

            tableView.getItems().add(product);

            nameField.clear();
            ammountField.clear();
            ratingField.clear();
        });

        Button deleteButton = new Button("Delete");
        deleteButton.setOnAction(e->{
            ObservableList<Product> selectedProduct,allProducts;
            allProducts = tableView.getItems();
            selectedProduct = tableView.getSelectionModel().getSelectedItems();
            selectedProduct.forEach(allProducts::remove);
        });

        HBox hBox = new HBox();
        hBox.setPadding(new Insets(10));
        hBox.setSpacing(10);
        hBox.getChildren().addAll(nameField,ammountField,ratingField,addButton,deleteButton);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(tableView,hBox);
        
        Scene scene = new Scene(vBox);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private ObservableList<Product> getProducts(){
        ObservableList<Product> products = FXCollections.observableArrayList();

        products.add(new Product("Memory Card",900,4.3));
        products.add(new Product("USB",1500,4.1));
        products.add(new Product("Hardisk",5000,3.9));
        products.add(new Product("SSD",10000,4.6));
        products.add(new Product("NVME",12000,4.9));

        return products;
    }
}
