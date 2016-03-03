import org.apache.spark.SparkContext
import org.apache.spark.SparkConf
import org.apache.spark.mllib.clustering.{KMeans, KMeansModel}
import org.apache.spark.mllib.linalg.Vectors
/*
 * Written by: Jose Carlos Carrasco Jimenez
*/

object Project extends App {
	val spConfig = (new SparkConf)
							.setMaster("local")
							.setAppName("SparkMLProject")

		val sc = new SparkContext(spConfig)
		println("Hello from Spark")

}
