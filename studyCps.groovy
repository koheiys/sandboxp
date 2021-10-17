import java.time.format.DateTimeFormatter;

MainScript create() {
  return new MainScript(); 
}

class MainScript {

  private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("uuuuMM");

  void main() {
    println "Hello";
    println "fmt=${fmt}";
  }
  
}

return this;
