package LogicHandle;

import entity.Reporter;
import run.MainRun;

import java.util.Scanner;

public class ReporterLogic {
    public static void reporterOutput() {
        for(int i = 0; i< MainRun.reporters.length; i++) {
            if(MainRun.reporters[i] != null) {
                System.out.println(MainRun.reporters[i]);
            }
        }
    }

    public static void reporterInput() {
        int reporterNum = new Scanner(System.in).nextInt();
        for(int i=0;i<reporterNum;i++) {
            System.out.println("Nhập vào phóng viên thứ " + (i+1) + " : ");
            Reporter reporter = new Reporter();
            reporter.InfoInput();
            for(int j=0;j<MainRun.reporters.length;j++) {
                if(MainRun.reporters[i] == null) {
                    MainRun.reporters[i] = reporter;
                    break;
                }
            }
        }
    }

    public static Reporter findReporterById(int reporterId) {
        Reporter reporter = null;
        for(int j =0;j < MainRun.reporters.length;j++) {
            if(MainRun.reporters[j] != null && MainRun.reporters[j].getId() == reporterId) {
                reporter = MainRun.reporters[j];
                break;
            }
        }
        return reporter;
    }
}
