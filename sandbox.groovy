import java.util.regex.Pattern;

X_PATTERNS = [
 '^develop$'
].collect { Pattern.compile(it) };

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

def doScript() {

 withCredentials([string(credentialsId: 'secret-test-1', variable: 'ts1')]) {
  
  println "ts1=${ts1}"
  
 }
 
}

def doLoadSample() {
 
 def Bar = load 'Bar.groovy';
 def bar = Bar.newInstance(str: '多段loadテスト', num: 222);
 println bar.hello('world bar')
 println X_PATTERNS;
}

return this;
