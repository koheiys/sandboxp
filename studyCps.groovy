import java.time.format.DateTimeFormatter;

private static final DateTimeFormatter FMT_S = DateTimeFormatter.ofPattern("uuuuMM");

void main(String msg) { 
  println "Hello ${msg} !!"
  println "FMT_S=${FMT_S}"
}

MainScript create() {
  return new MainScript(); 
}

class MainScript {

  private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("uuuuMM");

  void hello() {
    System.out.println "Hello";
    println "fmt=${fmt}";
  }
  
  String getString() {
    return "Hello!!"; 
  }
  
}

return this;
