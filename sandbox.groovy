
class Foo {
 
  String str;
  int num;
  
  def Foo(String str) {
    this.str = str;
  }
  
  def hello(String msg) {
    withCredentials([string(credentialsId: 'secret-test-1', variable: 'ts1')]) {
      return "Hello ${msg} : str=${str}, num=${num}, ts1=${ts1}"; 
    }
  }
  
}

String strField;

def createFoo(String str) {
  return new Foo(str);
}

def doLoadSample() {
 
 def Bar = load 'Bar.groovy';
 def bar = Bar.newInstance(str: '多段loadテスト', num: 222);
 println bar.hello('world bar')
 
}

return this;
