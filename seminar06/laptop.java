package seminar06;
import java.util.HashMap;
import java.util.Map;
public class laptop {
    String cpu;
    String oc;
    int ram;
    int ssd;

    public laptop(String cpu, String oc, int ram, int ssd) {
        this.cpu = cpu.toLowerCase();
        this.oc = oc.toLowerCase();
        this.ram = ram;
        this.ssd = ssd;
    }

    public String toString() {
        return cpu + ", " + oc + ", " + ram + ", " + ssd;
    }

    public  Map<Object,Object> parametrsMap() {
        Map<Object,Object> parametrslaptop = new HashMap<>();
        parametrslaptop.put("cpu", cpu);
        parametrslaptop.put("oc", oc);
        parametrslaptop.put("ram", ram);
        parametrslaptop.put("ssd", ssd);
        
        return parametrslaptop;
    }
}
