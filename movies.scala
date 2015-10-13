val movies = <movies>
  <movie>The Incredibles</movie>
  <movie>WALL E</movie>
</movies>

(movies \ "_").foreach { movie =>
  movie match {
    case <movie>{movieName}</movie> => println(movieName)
  }
}
