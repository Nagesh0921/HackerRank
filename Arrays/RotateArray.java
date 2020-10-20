public static List<Integer> rotateLeft(int d, List<Integer> arr) {
      if (arr.size() == 1) {
          return arr;
      }
      for (int i = 0; i<d; i++) {
          int removedElement = arr.remove(0);
          arr.add(removedElement);
      }
      return arr;
  }
