# LangLab
A language lab that makes your audio files for vocabulary learning more accessable and valuable!

Keywords:  Android, Kotlin, mp3, language, vocabulary, learning, 

You own audio files for learning vocabulary and phrases?  Then you observed that the better you get, the more inefficient these audio files are, because you are waiting longer and longer for yet unlearned vocabulary.

Those files usually have a fixed structure, typically:  

* optional spoken introduction with chapter and name of the company that made the file
* then a repeating pattern of words or phrases:
    * first language, 
    * second language, 
    * (optionally a second speaker, or other variations)
* ...repeated to the end.
* optionally another spoken outro, e.g. repeating the company name.

The idea behind this project is to have an Android app that understands the structure of such files, cuts them into phrases and presents them in changing order.  Additionally, the app will use the microphone to record the learner and analyse how well the phrase is learned and will adjust the probability of presenting this phrase.

Several learning modes can be implemented:

* Pronounciation:  
    * (Play first language) 
    * Play seconds language, 
    * Record second language, 
    * rate, recalculate scores
* Understanding:
    * Play second language,
    * Record first language,
    * Rate, recalculate scores
    * Play first language as confirmation,
* Active vocabulary:
    * Play first language
    * Record second language, 
    * rate, recalculate scores
    * Play seconds language as confirmation

This app will not have bundled audio files. It will be tested against many freely available training material, though.


