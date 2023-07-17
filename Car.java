public class Car {
    //object attributes
  private String type;
  private int speed;
  private String model;
  private String colour;

  ///from here down these are getters - they help use the properties we put under private
    ///always put private on the objects for security
  public String getType(){
    return this.type;
  }
    public String getModel(){
        return this.model;
    }
    public String getColour(){
        return this.colour;
    }
    public int getSpeed(){
        return this.speed;
    }

    ///from here down these are setters, used to reset the values of the properties
//
//    public String setType(String type){
//        this.type = type;
//    }
//
//    public String setColour(String colour){
//        this.colour = colour;
//    }
//    public String setModel(String model){
//        this.model = model;
//    }


  //objects constructor (method)
    public Car(String carType, String model, String colour, int speed){
       this.type = carType;
       //למען נוחיותנו קראנו למשתנים באותם שמות, אבל לקוד לא אכפת
        //כל עוד אנחנו שולפים את המשתנה המדויק ומשייכים אותו למשתנה שניתן לרונסטרקטור השמו תיכולים להיות שונים
        //כלומר, הthis חייב לשלוף את התכונה של האובייקט מלמעלה, אבל הוא יכול להיות משויך לתכונה עם השם החדש שניתנה לקונסטרקטור
        this.colour = colour;
        this.model = model;
        this.speed = speed;
    /// the main thread that will call this object is in Main
    }

}
