#[macro_use]
extern crate structopt;

use structopt::StructOpt;

/// Ernest CI Agent
#[derive(StructOpt, Debug)]
#[structopt(name = "agent")]
struct Opt {
    /// Github Commit to build.
    #[structopt(name = "COMMIT")]
    files: String,
}
fn main() {
    let opt = Opt::from_args();
    println!("{:?}", opt);
}
