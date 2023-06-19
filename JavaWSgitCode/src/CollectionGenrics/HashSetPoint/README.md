Hash Set can work badly if hashcode is coded badly.

Ex int hc = hashcode() {return 0}
  hc = abs(hc);
  int bucketIndex = hc % NoOfBuckets;


//In above the bucketIndex is always 0,

Loading factor(Lamda) might not reflect the preformance. 


The internal hashFunction , using the hascode decides which bucket it needs to go
