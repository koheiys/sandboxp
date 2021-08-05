
class Foo {
 
  String str;
  int num;
  
  def Foo(String str) {
    this.str = str;
  }
  
  def hello(String msg) {
    return "Hello ${msg} : str=${str}, num=${num}"; 
  }
  
}

String strField;

def createFoo(String str) {
  return new Foo(str);
}

return this;
