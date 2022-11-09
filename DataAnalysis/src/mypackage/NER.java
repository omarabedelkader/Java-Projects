package mypackage;
import java.util.*;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class NER {
	
	public static void main(String [] args){
		
		//part 1
		StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
		
		ReadFileToString readfiletostring =new ReadFileToString();
		String filepath = "D:/Program Files/eclipse/Omar/AssiDataAnalysis/src/mypackage/DataSet.txt";
		String filesplited = Arrays.toString(readfiletostring.usingBufferedReader(filepath).split(","));
		
		CoreDocument coreDocument = new CoreDocument(filesplited);
		stanfordCoreNLP.annotate(coreDocument);	
		List<CoreLabel> coreLabels = coreDocument.tokens();
		
		int i = 0;
		for(CoreLabel coreLabel : coreLabels)
		{
			System.out.println("The token number " + i + " = " + coreLabel.originalText());
			i++;
		}
		System.out.println("The number of tokens in my text is: " + i);
		
		// part 2
		double a1=0, b1=0, c1=0, d1=0, e1=0, f1=0, g1=0, h1=0,i1=0,j1=0;
		
		for(CoreLabel coreLabel: coreLabels){
			String ner = coreLabel.get(CoreAnnotations.NamedEntityTagAnnotation.class);
			if (ner == "CITY" || ner == "City" || ner == "city")
				a1++;
			if (ner == "PERSON" || ner =="Person" || ner =="person" )
				b1++;
			if (ner == "O"|| ner =="0")
				c1++;
			if (ner == "ORGANIZATION" || ner=="Organization" || ner =="organization" ) 
				d1++;
			if (ner == "DATE" || ner == "Date"|| ner == "date" )
				e1++;
			if (ner == "DURATION" || ner == "Duration" || ner == "duration")
				f1++;
			if (ner == "NUMBER" || ner == "Number" || ner =="number")
				g1++;
			if (ner == "STATE_OR_PROVINCE" || ner== "State or province" || ner=="state or province" )
				h1++;
			if (ner == "TITLE" || ner== "Title" || ner=="title" )
				i1++;
			if (ner == "MISC" || ner== "MISC" || ner=="MISC" )
				j1++;
			
			System.out.println(coreLabel.originalText() + " NER is :" + ner);
		}	

		System.out.println("Total number of City class in our text is " + a1);
        System.out.println("\nTotal number of Person class in our text is "+ b1);
        System.out.println("\nTotal number of O class in our text is "+ c1);
        System.out.println("\nTotal number of Organizations class in our text is "+ d1);
        System.out.println("\nTotal number of Dates class in our text is "+ e1);
        System.out.println("\nTotal number of Durations class in our text is "+ f1);
        System.out.println("\nTotal number of NUMBER class in our text is "+ g1);
        System.out.println("\nTotal number of STATE_OR_PROVINCE class in our text is "+ h1);
        System.out.println("\nTotal number of TITLE class in our text is "+ i1);
		
        
        //part 3
        double a2=0, b2=0, c2=0, d2=0, e2=0, f2=0, g2=0, h2=0,i2=0,j2=0;
        StanfordCoreNLP stanfordcorenlp = Pipeline.getPipeline();
		CoreDocument coredocument = new CoreDocument(filesplited);
		List<CoreSentence> sentences = coredocument.sentences();
		stanfordcorenlp.annotate(coredocument);	
		for(CoreSentence sentence : sentences)
		{
			for(CoreLabel coreLabel: coreLabels){
				String ner = coreLabel.get(CoreAnnotations.NamedEntityTagAnnotation.class);
				if (ner == "CITY" || ner == "City" || ner == "city")
					a2++;
				if (ner == "PERSON" || ner =="Person" || ner =="person" )
					b2++;
				if (ner == "O"|| ner =="0")
					c2++;
				if (ner == "ORGANIZATION" || ner=="Organization" || ner =="organization" ) 
					d2++;
				if (ner == "DATE" || ner == "Date"|| ner == "date" )
					e2++;
				if (ner == "DURATION" || ner == "Duration" || ner == "duration")
					f2++;
				if (ner == "NUMBER" || ner == "Number" || ner =="number")
					g2++;
				if (ner == "STATE_OR_PROVINCE" || ner== "State or province" || ner=="state or province" )
					h2++;
				if (ner == "TITLE" || ner== "Title" || ner=="title" )
					i2++;
				if (ner == "MISC" || ner== "MISC" || ner=="MISC" )
					j2++;
				System.out.println(coreLabel.originalText() + " NER is :" + ner);
			}	
		}
		int max =(int) Math.max(Math.max(Math.max(Math.max(Math.max( Math.max( Math.max(a2, b2), c2 ), d2), e2),f2),g2),h2);
        if (max== a2)
        {
        	System.out.println("CITY");
        }
        if (max== b2)
        {
        	System.out.println("PERSON");
        }
        if (max== c2)
        {
        	System.out.println("O");
        }
        if (max== d2)
        {
        	System.out.println("ORGANIZATION");
        }
        if (max== e2)
        {
        	System.out.println("DATE");
        }
        if (max== f2)
        {
        	System.out.println("DURATION");
        }
        if (max== g2)
        {
        	System.out.println("NUMBER");
        }
        if (max== h2)
        {
        	System.out.println("STATE_OR_PROVINCE");
        }
        if (max== i2)
        {
        	System.out.println("TITLE");
        }
        if (max== j2)
        {
        	System.out.println("MISC");
        }
        
        // part 4         
        int max1 =(int) Math.max(Math.max(Math.max(Math.max(Math.max( Math.max( Math.max(a1, b1), c1 ), d1), e1),f1),g1),h1);
        if (max1== a1)
        {
        	System.out.println("CITY");
        }
        if (max1== b1)
        {
        	System.out.println("PERSON");
        }
        if (max1== c1)
        {
        	System.out.println("O");
        }
        if (max1== d1)
        {
        	System.out.println("ORGANIZATION");
        }
        if (max1== e1)
        {
        	System.out.println("DATE");
        }
        if (max1== f1)
        {
        	System.out.println("DURATION");
        }
        if (max1== g1)
        {
        	System.out.println("NUMBER");
        }
        if (max1== h1)
        {
        	System.out.println("STATE_OR_PROVINCE");
        } 
        if (max== i1)
        {
        	System.out.println("TITLE");
        }
        if (max== j1)
        {
        	System.out.println("MISC");
        }
	}

}
