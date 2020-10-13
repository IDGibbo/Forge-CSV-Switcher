package io.github.idgibbo.utils;

import org.jetbrains.java.decompiler.main.decompiler.ConsoleDecompiler;
import java.io.File;

public class FernFlowerUtils {

	public static void decompile(File file, File to) {
		decompile(file, to, false);
	}
	
	public static void decompile(File file, File to, boolean renameAll) {
		String[] args = null;
		
		if(renameAll) {
			args = new String[] {"-ren=1", file.getAbsolutePath(), to.getAbsolutePath() };
		}else {
			args = new String[] {file.getAbsolutePath(), to.getAbsolutePath() };
		}
		
		ConsoleDecompiler.main(args);
	}
	
}
