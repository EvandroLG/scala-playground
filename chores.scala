def doChore(chore: String): String = chore match {
  case "clean dishes" => "scrub, dry"
  case "cook dinner" => "chopp, sizzle"
  case _ => "whine, complain"
}

println(doChore("clean dishes"))
