package com.endamiley.commands

import com.endamiley.files.{DirEntry, Directory}
import com.endamiley.filesystem.State

class Mkdir(name: String) extends CreateEntry(name) {

  override def createSpecificEntry(state: State): DirEntry =
    Directory.empty(state.wd.path, name)
}
