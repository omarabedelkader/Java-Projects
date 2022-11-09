package mypackage;

import java.util.*;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class SentimentAnalysis {
	public static void main(String []args)
	{
		//part 2
		StanfordCoreNLP stanfordcorenlp = Pipeline.getPipeline();
		
		// part 3
		ReadFileToString readfiletostring =new ReadFileToString();
		String filepath = "D:/Program Files/eclipse/Omar/AssiDataAnalysis/src/mypackage/DataSet.txt";
		
		//part 4
		String filesplited = Arrays.toString(readfiletostring.usingBufferedReader(filepath).split(","));
		
		
		CoreDocument coredocument = new CoreDocument(filesplited);		
		stanfordcorenlp.annotate(coredocument);		
		List<CoreSentence> sentences = coredocument.sentences();
		
		for(CoreSentence sentence : sentences)
		{
			String sentiment = sentence.sentiment();
			System.out.println(sentiment+ " ==>> "+sentence);	
		}
		
		//part 5
		int a=0,b=0,c=0; 
		System.out.println("The count of Sentiment");
		for(CoreSentence sentence : sentences)
		{
			String sentimentcount = sentence.sentiment();
			if(sentimentcount == "Positive")
			{
				a++;
			}
			if(sentimentcount == "Negative")
			{
				b++;
			}
			if(sentimentcount == "Neutral")
			{
				c++;
			}
		}
		System.out.println("");
		System.out.println("The number of sentiment Positive "+a);
		System.out.println("The number of sentiment Negative "+b);
		System.out.println("The number of sentiment Neutral "+c);
		
		int count=0;
		for(CoreSentence sentence : sentences)
		{
			count++;
		}
		
		//part 6
		System.out.println("\nThe number of sentence "+count);
		double poscount = a/count;
		double negcount = b/count;
		double neucount = c/count;
		System.out.println("The division of Positive / Number of Sentence "+ poscount);
		System.out.println("The division of Negative / Number of Sentence "+ negcount);
		System.out.println("The division of Neutral / Number of Sentence "+ neucount);
		
		//part 7
		System.out.println("");
		int max = (int) Math.max( Math.max(poscount, negcount), neucount);
		System.out.println("The maximum is "+max);
		if(max == poscount)
		{
			System.out.println("The sentence is positive");
		}
		if(max == negcount)
		{
			System.out.println("The sentence is Negative");
		}
		if(max == neucount)
		{
			System.out.println("The sentence is Neutrale");
		}
		
	}
}
