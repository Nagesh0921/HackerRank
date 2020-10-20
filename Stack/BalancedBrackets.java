static String isBalanced(String s) {
      if (s == null && s.length() == 0) {
          return "NO";
      }
      Stack<Character> bracket = new Stack<>();
      for (int i = 0; i < s.length(); i++) {
          switch (s.charAt(i)) {
              case '{':
              case '[':
              case '(': {
                  bracket.push(s.charAt(i));
                  break;
              }
              case '}': {
                  if (bracket.isEmpty() || bracket.peek() != '{'){
                      return "NO";
                  } 
                  bracket.pop();
                  break;
              }
              case ']': {
                  if (bracket.isEmpty() || bracket.peek() != '['){
                      return "NO";
                  }
                  bracket.pop();
                  break;
              }
              case ')': {
                  if (bracket.isEmpty() || bracket.peek() != '('){
                      return "NO";
                  }
                  bracket.pop();
                  break;
              }
              default:
                  return "NO";
          }
      }
      return "YES";
  }
