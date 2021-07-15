## Steps taken to upload from local project:
##   Step 5 was tricky to add subdirectories with files
1.  create repository through website with just readme file	

2.  clone GIT repository created above to local drive GIT project area
	
	git clone https://github.com/tlw8253/UnitConverter.git

3.  move project directories and files in to local drive GIT project area

4.  use command: git status often to check if repository is up to date

## 5.  add directories path and files with git add as in the following example:

##     		git add scr/..
    
    the above will stage the files to add in the next two steps

6.  run git commit as follows, you will be sent to VIM editor and must add a comment:
	
	git commit -a  
	
7.  final step update the repository on GitHub:
	
	git push

8.  final status check

	git status


## Steps to take to download files, compile files, and run Java Program
1.  clone repository to your local project area
    
    git clone https://github.com/tlw8253/UnitConverter.git
    
2. open Git Bash
3. cd to the UnitConverter source code conatined under src/main (example directory structure):
   
   cd /desktop/RevCode/Projects/UnitConverter/src/main
   
4. perform ls to verify the following file are present:
    
    Converter.java
    
    ConverterMenu.java
    
    ConverterConstants.java
    
    DistanceConverter.java
    
    VolumeConverter.java
    
    LiquidConverter.java
    
## 5. compile the source as follows, the ConverterConstants.java must be done first
    javac ConverterConstants.java
    
  6.  the other files can be done in any order, however must include the classpath argument as follows:
      
      javac -cp .. ConverterMenu.java
      
      javac -cp .. DistanceConverter.java
      
      javac -cp .. VolumeConverter.java
      
      javac -cp .. Converter.java
      
      javac -cp .. LiquidConverter.java
      
  7.  the Java class files should now be generated.
  8.  go up one directory to src:
      
      cd ..
      
  9.  run the program as follows from the /src directory:
      
      java main.Converter
      
 10.  follow the program prompts
 
 ##  Note the expected input is integer for menu selection and allows decimal values for conversion items
 ##  NO exception processing is included so entering an unexpected value will crash the program.
      
    
