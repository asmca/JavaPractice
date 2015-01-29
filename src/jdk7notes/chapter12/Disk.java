package jdk7notes.chapter12;

import java.io.IOException;
import java.nio.file.*;
import java.text.DecimalFormat;

/**
 * Created by suse on 1/28/15.
 */
public class Disk {
    public static void main(String[] args) throws IOException{
        if (args.length ==0){
            FileSystem fs = FileSystems.getDefault();
            for (FileStore store: fs.getFileStores()){
                print(store);
            }
        }else {
            for (String file: args){
                FileStore store = Files.getFileStore(Paths.get(file));
                        print(store);
            }
        }

    }

    public static void print(FileStore store) throws IOException{
        long total = store.getTotalSpace();
        long used = store.getTotalSpace() - store.getUnallocatedSpace();
        long usable = store.getUsableSpace();

        DecimalFormat formatter = new DecimalFormat("#,##,###");

        System.out.println(store.toString());

        System.out.printf("\t- 总容量\t%s\t字节 %n", formatter.format(total));
        System.out.printf("\t-已用空间\t%s\t字节 %n", formatter.format(used));
        System.out.printf("\t-可用空间\t%s\t字节 %n", formatter.format(usable));


    }

}
