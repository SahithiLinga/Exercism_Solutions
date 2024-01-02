class RnaTranscription {

    String transcribe(String dnaStrand) {
      return dnaStrand
        .replace('A', 'U')
        .replace('T', 'A')
        .replace('C', 'X')
        .replace('G', 'C')
        .replace('X', 'G');
        
    }

}