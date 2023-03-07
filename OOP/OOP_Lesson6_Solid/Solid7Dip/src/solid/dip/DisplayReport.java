package solid.dip;

import java.util.List;

public class DisplayReport implements Output{

    @Override
    public void output(List<ReportItem> items) {
        System.out.println("Output to consol: ");
        for (ReportItem item : items) {
            System.out.format("consol %s - %f \n\r", item.getDescription(), item.getAmount());
        }

    }
}
