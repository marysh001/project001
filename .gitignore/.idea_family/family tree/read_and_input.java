
    import family_tree.io.*;
class ShowFile {
  public static void main(String args[])
  {
    int i;
    FilelnputStream fin = null;

    if (args.length != 1)   {
      System.out.println("Usage: ShowFile Human");
      return;
    }

    try {
      fin = new FilelnputStream(args[0]);
      do {
        i = fin.read() ;
        if(i != -1) System.out.print((char) i);
      } while(i != -1);
    } catch(FileNotFoundException exc) {
      System.out.println("File Not Found.");
    } catch(IOException exc) {
      System.out.println("An I/O Error Occurred");
    } finally {

      try {
        if (fin != null) fin.closeO;
      } catch(IOException exc) {
        System.out.println("Error Closing File");
      }
    }
  }
}
