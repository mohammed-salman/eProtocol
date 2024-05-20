package Utils;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.bs.A;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.junit.Assert;
import org.openqa.selenium.support.ui.FluentWait;

import java.io.*;
import java.time.Duration;
import java.util.List;

public class ReadPDF {
    String projectPath = System.getProperty("user.dir") + "/Downloads/cagecard.pdf";
    PDDocument document;
    static String expected, actual;
    File file = new File(projectPath);
    PDFTextStripper stripper;

    public static void main(String args[]) throws IOException {

      new ReadPDF().getPdffile();
        //new ReadPDF().verifyPdf();

        //  new ReadPDF().deletefile();
    }

    public void getPdffile() throws IOException {

        FluentWait<File> wait=new FluentWait<File>(file)
                .withTimeout(Duration.ofMinutes(5))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(Exception.class)
                .withMessage("File is not downloaded");
        boolean isDownloaded=wait.until(f -> f.exists() && f.canRead());
        if(isDownloaded) {
            document = PDDocument.load(file);
            stripper = new PDFTextStripper();
            actual = stripper.getText(document);
           System.out.println(actual);
        }
        else {
            Assert.fail("Document is not downloaded");
        }
        int count=document.getNumberOfPages();

        boolean isempty=(count==0);

        if(isempty)
        {
            Assert.fail("fail is empty");
        }
        else
        {
            System.out.println("PDF is not empty");
        }




    }




    public void deletefile()
    {
        file.delete();
    }

    public void verifyContent(DataTable table) throws IOException {

        List<List<String>> data = table.asLists();

        String key;
        int rowCount=data.size();

        for(int i=1;i<rowCount;i++)

        {
          key=data.get(i).get(0);

          if(actual.contains(key))
          {
              System.out.println("Key is presen in pdf "+key);
          }
          else
          {
              Assert.fail("key is not present "+key);
          }

        }
       // document.close();
        deletefile();

    }
}