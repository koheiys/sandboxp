import java.time.format.DateTimeFormatter;

MainScript create() {
  return new MainScript(); 
}

class MainScript {

  private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("uuuuMM");

  void hello() {
    println "Hello";
    println "fmt=${fmt}";
  }
  
}

return this;
