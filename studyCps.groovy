import java.time.format.DateTimeFormatter;

def fmt = DateTimeFormatter.ofPattern("uuuuMM");

void main() {
  println "Hello";
  println "fmt=${fmt}";
}

return this;
