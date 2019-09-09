package com.endamiley.commands

import com.endamiley.filesystem.State

class UnknownCommand extends Command {

  override def apply(state: State): State =
    state.setMessage("Command not found!")

}
