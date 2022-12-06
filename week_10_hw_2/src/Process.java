import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Process {
	private String prDir;
	
	private final String DIR = "dir";
	private final String CD = "cd";
	private final String MKDIR = "mkdir";
	private final String RMDIR = "rmdir";
	private final String RENAME = "rename";
	private final String EXIT = "exit";
	
	public Process() {
		this.prDir = System.getProperty("user.dir");
	}
	
	public void run() {
		Scanner scanner = new Scanner(System.in, "EUC-KR");
		boolean r = true;
		
		while(r) {
			System.out.print(this.prDir+">>");
			Cmd cmd = new Cmd(scanner.nextLine());
			System.out.println();
			
			switch(cmd.getCmdP(0)) {
			case DIR:{
				File[] directories = new File(this.prDir).listFiles();
				
				for(File file : directories) {
					System.out.println(file.toString());
				}
			}
			break;
			
			case CD:{
				File absolute = new File(cmd.getCmdP(1));
				File subDir = new File(this.prDir+"\\"+cmd.getCmdP(1));
				
				if(absolute.toString().equals("..")) {
					this.prDir = new File(this.prDir).getParent();
				}
				else if(subDir.isDirectory()) {
					this.prDir = subDir.toString();
				}
				else if(absolute.isDirectory()&&absolute.toString().contains(":")) {
					this.prDir = absolute.toString();
				}
				else {
					System.out.println("Not found \""+cmd.getCmdP(1)+"\"");
				}
			}
			break;
			
			case MKDIR:{
				File file = new File(this.prDir + "\\" + cmd.getCmdP(1));

                if (!file.mkdirs()) {
                    System.out.println("Not created directory");
                }
                else {
                    System.out.println("Created \"" + file.toString() + "\"");
                }
			}
			break;
			
			case RMDIR:{
				File file = new File(this.prDir + "\\" + cmd.getCmdP(1));

                ArrayList<File> files = new ArrayList<>();

                if (!file.exists()) {
                    System.out.println("Not deleted directory");
                }
                else {
                    reculsiveFile(files, file);

                    System.out.println("You want to delete " + files.size() + " files? y/n");

                    if (scanner.nextLine().equals("y")) {
                        for (int i = files.size() - 1; i >= 0; i--) {
                            files.get(i).delete();
                        }

                        System.out.println("Deleted \"" + file.toString() + "\"");
                    }
                }
			}
			break;
			
			case RENAME:{
                File file = new File(this.prDir + "\\" + cmd.getCmdP(1));

                if (!file.renameTo(new File(this.prDir + "\\" + cmd.getCmdP(2)))) {
                    System.out.println("Not renamed");    
                }
                else {
                    System.out.println("Renamed \"" + file.toString() + "\"");
                }
            }
            break;
            
            case EXIT:{
                r = false;
            }
            break;
            default:{
                System.out.println("Not defined command");
            }
			}
			System.out.println();
		}
		
		scanner.close();
	}
	
	private void reculsiveFile(ArrayList<File> files, File file) {
		files.add(file);
		
		if(file.listFiles()!=null) {
			for(File subFile : file.listFiles()) {
				reculsiveFile(files, subFile);
			}
		}
	}
}
