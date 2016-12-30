/**
  * Created by sodel on 12/12/16.
  */

//package org.apache.spark.examples.mllib

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
// $example on$
import org.apache.spark.mllib.feature.{Word2Vec, Word2VecModel}
// $example off$

object Word2VecExample {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("Word2VecExample")
    conf.setMaster("local[2]")
    val scn = new SparkContext(conf)

    // $example on$
    val input = scn.textFile("/home/sodel/spark-2.0.0/data/mllib/sample_lda_data.txt").map(line => line.split(" ").toSeq)

    val word2vec = new Word2Vec()

    val model = word2vec.fit(input)

    val synonyms = model.findSynonyms("1", 5)

    for((synonym, cosineSimilarity) <- synonyms) {
      println(s"$synonym $cosineSimilarity")
    }

    // Save and load model
   /** model.save(scn, "myModelPath")
    val sameModel = Word2VecModel.load(scn, "myModelPath")
    // $example off$

    scn.stop()**/
  }
}