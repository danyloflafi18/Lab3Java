package ua.lviv.iot.insurance.managers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import ua.lviv.iot.insurance.models.Insurance;

public class InsuranceWriter {

    public final void writeToFile(final List<Insurance> insurance,
            final File file)
            throws IOException, FileNotFoundException {

        try (FileOutputStream fos = new FileOutputStream(file);
                OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
                BufferedWriter bufWriter = new BufferedWriter(osw);) {

            for (int i = 0; i < insurance.size(); i++) {

                bufWriter.write(insurance.get(i).getHeaders());
                bufWriter.newLine();
                bufWriter.write(insurance.get(i).toCSV());
                if (i < insurance.size() - 1) {
                    bufWriter.newLine();
                    bufWriter.newLine();
                }
            }
        }
    }
}