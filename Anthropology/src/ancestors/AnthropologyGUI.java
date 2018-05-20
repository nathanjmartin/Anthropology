package ancestors;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AnthropologyGUI extends Application {
    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        
        //texts
        Text starText = new Text("* CHON biochemistry\n*DNA and RNA inheritance\n*CellStructure\n*The four universal life processes");
        
        Text wormText = new Text("*Love of Oxygen\n*Large complex cells with nuclei\n*Potential for multicelluar body\n*Sexual reproduction/nerves\n*muslces/mouths/nutrient requirements");
        wormText.setFill(Color.WHITE);
        
        
        //Text for the fish ancestor
        Text fishText = new Text("*Backbone\t\t*Ribs\t\t\t*Jaws\t\t\t*Axial Skeleton");
        fishText.setFill(Color.RED);
        
        Text amphibianText = new Text("*Lungs\n*Mobile Neck\n*4 limbs with pectoral and pelvic girdles\n*Appendicular skeleton");
        amphibianText.setFill(Color.BLUE);
        
        Text mammalText = new Text("*Warmbloodedness\n*Live birth and lactation\n*Fur/hair\n*Heterodonty and occlusion");
        mammalText.setFill(Color.RED);
        
        Text primateText = new Text("*Clavicle\n*Heterodonty\n*pentadactly\n*Grasping hands\n*Convergent forward-facing eyes\n*Post-orbital bar to protect forward facing eyes"
                + "\n*Particular brain organization");
        primateText.setFill(Color.VIOLET);
        primateText.setFont(Font.font(20));
        
        //Buttons
        Button submit = new Button("Find the legacies");
        Button back = new Button("Back");
        
        //Labels
        Label starTitle = new Label("Our star legacies:");
        
        
        Label wormTitle = new Label("Our worm legacies:");
        wormTitle.setTextFill(Color.WHITE);
        
        Label fishTitle = new Label("Our fish legacies:");
        fishTitle.setTextFill(Color.RED);
        
        Label amphibianTitle = new Label("Our tetrapod/ambhibian legacies: ");
        amphibianTitle.setTextFill(Color.BLUE);
        
        Label mammalTitle = new Label("Our mammalian adaptations: ");
        mammalTitle.setTextFill(Color.RED);
        
        
        Label primateTitle = new Label("Our primate adaptations: ");
        primateTitle.setTextFill(Color.VIOLET);
        primateTitle.setFont(Font.font(20));
        //Images
        //original image
        Image anthropology = new Image("https://hannahc12.files.wordpress.com/2010/05/evolution1.jpeg");
        
        
        //ancestor images
        //star - CHON biochemistry, DNA and RNA inheritance, Cell structure,
        //the four universal life processes
        Image starAncestor = new Image("https://image.freepik.com/free-photo/galaxy-scene_1048-5105.jpg");
        
        //love of oxygen, large complex cells with nuclei, potential for multicellular body,
        //sexual reproduction/nerves, muscles/mouths/guys/nurtient requirements
        Image wormAncestor = new Image("https://media1.britannica.com/eb-media/55/28355-004-64219017.jpg");
        
        //origin of our jaws, axial skeleton, backbone, and ribs
        Image fishAncestor = new Image("https://i.pinimg.com/originals/bd/ce/01/bdce018eee41716bed437654e35ec6fa.jpg");
        
        //lungs, mobile neck, 4 limbs with pectoral and pelvic girdles, appendicular skeleton
        Image amphibianAncestor = new Image("https://static1.squarespace.com/static/544a8422e4b08fa6e30a5a93/544bf2dbe4b0489fb89a63f9/544bf3a6e4b0001029019a6d/1414263720209/Tiktaalik2.jpg?format=750w");
        
        //warmbloodedness, live birth and lactation, fur(hair), heterodonty and occlusion
        Image mammalAdapt = new Image("https://i.pinimg.com/originals/b4/4c/b8/b44cb8cb5b9bd31e5c9d094847ecaae6.png");
        
        //clavicle(collar bone), heterodonty, pentadactly, grasping hands, convenrgent forward-facing eyes,
        //post-orbital bar to protect forward-facing eyes, particular brain organization
        Image primateAdapt = new Image("https://3c1703fe8d.site.internapcdn.net/newman/gfx/news/2015/brainsgenesa.jpg");
        
        //backgrounds
        BackgroundImage background = new BackgroundImage(anthropology, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        BackgroundImage starBackground = new BackgroundImage(starAncestor, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        BackgroundImage wormBackground = new BackgroundImage(wormAncestor, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        BackgroundImage fishBackground = new BackgroundImage(fishAncestor, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        BackgroundImage amphibianBackground = new BackgroundImage(amphibianAncestor, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        BackgroundImage mammalBackground = new BackgroundImage(mammalAdapt, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        BackgroundImage primateBackground = new BackgroundImage(primateAdapt, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        
      
        //home page
        
        
        
        
        //ChoiceBox (Drop down box) for choosing which ancestor you wish to find the legacies of
        ChoiceBox<String> ancestors = new ChoiceBox<String>(FXCollections.observableArrayList("Inner star" , "Inner worm", "Inner fish",
                "Inner Tetrapod/Amphibian", "Mammalian adaptations", "Primate adaptations"));
        ancestors.setPrefWidth(200);
        
        
        //grid for holding the background and buttons
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        grid.setBackground(new Background(background));
        
        
        //Hbox for holding the buttons
        HBox btnHolder = new HBox();
        btnHolder.setAlignment(Pos.BOTTOM_CENTER);
        btnHolder.getChildren().add(submit);
        
        HBox backHolder = new HBox();
        backHolder.setAlignment(Pos.BOTTOM_CENTER);
        backHolder.getChildren().add(back);
        
        //adding to grid
        grid.add(ancestors, 0, 1);
        grid.add(btnHolder, 0, 4);
        
        //creating scenes / adding the grid to a scene
        Scene scene = new Scene(grid, 600, 500);
        
        //adding the scene to the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Legacies");
        primaryStage.setResizable(false);
        primaryStage.show();
        
        
        
        
        
        /////////////////////////////////////////////////////BUTTON ACTIONS//////////////////////////////////////////////////////////////
        
        //getting the users choice
        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                String choice = ancestors.getSelectionModel().getSelectedItem();
                try {
                if(choice.equals("Inner star")) {
                    GridPane starGrid = new GridPane();
                    starGrid.setAlignment(Pos.CENTER);
                    starGrid.setHgap(10);
                    starGrid.setVgap(10);
                    starGrid.setPadding(new Insets(25, 25, 25, 25));
                    starGrid.add(starTitle, 0, 10);
                    starGrid.add(starText, 0, 12);
                    starGrid.add(backHolder, 0, 25);
                    starGrid.setBackground(new Background(starBackground));
                    
                    
                    
                    
                    Scene starScene = new Scene(starGrid, 600, 425);
                    primaryStage.setScene(starScene);
                }
                
                
                if(choice.equals("Inner worm")) {
                    //code for inner worm
                    GridPane wormGrid = new GridPane();
                    wormGrid.setAlignment(Pos.CENTER);
                    wormGrid.setHgap(10);
                    wormGrid.setVgap(10);
                    wormGrid.setPadding(new Insets(25, 25, 25, 25));
                    wormGrid.add(wormTitle, 0, 10);
                    wormGrid.add(wormText, 0, 11);
                    wormGrid.add(backHolder, 0, 25);
                    wormGrid.setBackground(new Background(wormBackground));
                    
                    Scene wormScene = new Scene(wormGrid, 500, 400);
                    primaryStage.setScene(wormScene);
                    
                }
                
                
                if(choice.equals("Inner fish")) {
                    //code for inner fish
                    GridPane fishGrid = new GridPane();
                    fishGrid.setAlignment(Pos.CENTER);
                    fishGrid.setHgap(10);
                    fishGrid.setVgap(10);
                    fishGrid.setPadding(new Insets(25, 25, 25, 25));
                    fishGrid.add(backHolder, 0, 22);
                    fishGrid.add(fishTitle, 0, 0);
                    fishGrid.add(fishText, 0, 1);
                    fishGrid.setBackground(new Background(fishBackground));
                    
                    
                    Scene fishScene = new Scene(fishGrid, 700, 315);
                    primaryStage.setScene(fishScene);
                    
                }
                
                
                if(choice.equals("Inner Tetrapod/Amphibian")) {
                    //code for inner tetrapod/amphibian
                    GridPane tetraGrid = new GridPane();
                    tetraGrid.setAlignment(Pos.CENTER);
                    tetraGrid.setHgap(10);
                    tetraGrid.setVgap(10);
                    tetraGrid.setPadding(new Insets(25, 25, 25, 25));
                    tetraGrid.add(amphibianText, 0, 20);
                    tetraGrid.add(backHolder, 0, 35);
                    tetraGrid.setBackground(new Background(amphibianBackground));
                    
                    
                    Scene tetraScene = new Scene(tetraGrid, 750, 500);
                    primaryStage.setScene(tetraScene);
                    
                }
                
                
                if(choice.equals("Mammalian adaptations")) {
                    //code for mammalian
                    GridPane mammalGrid = new GridPane();
                    mammalGrid.setAlignment(Pos.CENTER);
                    mammalGrid.setHgap(10);
                    mammalGrid.setVgap(10);
                    mammalGrid.setPadding(new Insets(25, 25, 25, 25));
                    mammalGrid.add(mammalTitle, 1, 4);
                    mammalGrid.add(mammalText, 1, 5);
                    mammalGrid.add(backHolder, 1, 35);
                    mammalGrid.setBackground(new Background(mammalBackground));
                    
                    
                    Scene mammalScene = new Scene(mammalGrid, 800, 500);
                    primaryStage.setScene(mammalScene);
                    
                }
                
                
                if(choice.equals("Primate adaptations")) {
                    //code for primates
                    GridPane primateGrid = new GridPane();
                    primateGrid.setAlignment(Pos.CENTER);
                    primateGrid.setHgap(10);
                    primateGrid.setVgap(10);
                    primateGrid.setPadding(new Insets(25, 25, 25, 25));
                    primateGrid.add(primateTitle, 0, 4);
                    primateGrid.add(primateText, 0, 5);
                    primateGrid.add(backHolder, 0, 20);
                    primateGrid.setBackground(new Background(primateBackground));
                    
                    
                    Scene primateScene = new Scene(primateGrid, 725, 500);
                    primaryStage.setScene(primateScene);
                }
                
                
            }catch(Exception n) {
                submit.setText("Choose an option!");
            }
            }});
        
        
        //back button action
        back.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    start(primaryStage);
                }catch(Exception ex) {
                    ex.printStackTrace();
                }
            }
            
        });
                
    
    }
}