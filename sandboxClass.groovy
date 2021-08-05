class Foo {
  String str;
  int num;
  
  String hello(String msg) {
    return "Hello ${msg} : str=${str}, num=${num}";
  }
}

return Foo;
