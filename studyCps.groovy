import java.time.format.DateTimeFormatter;

MainScript create() {
  return new MainScript(); 
}

class MainScript {

  private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("uuuuMM");

  void hello() {
    echo "Hello";
    println "fmt=${fmt}";
  }
  
  String getString() {
    return "Hello!!"; 
  }
  
}

return this;
