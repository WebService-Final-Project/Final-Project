# Final-Project

const chalk = require('chalk')
const getUsage = require('command-line-usage')
const header =
`██▀███  ▓█████ ▓█████▄  ██▀███   █    ██  ███▄ ▄███▓
▓██ ▒ ██▒▓█   ▀ ▒██▀ ██▌▓██ ▒ ██▒ ██  ▓██▒▓██▒▀█▀ ██▒
▓██ ░▄█ ▒▒███   ░██   █▌▓██ ░▄█ ▒▓██  ▒██░▓██    ▓██░
▒██▀▀█▄  ▒▓█  ▄ ░▓█▄   ▌▒██▀▀█▄  ▓▓█  ░██░▒██    ▒██
░██▓ ▒██▒░▒████▒░▒████▓ ░██▓ ▒██▒▒▒█████▓ ▒██▒   ░██▒
░ ▒▓ ░▒▓░░░ ▒░ ░ ▒▒▓  ▒ ░ ▒▓ ░▒▓░░▒▓▒ ▒ ▒ ░ ▒░   ░  ░
 ░▒ ░ ▒░ ░ ░  ░ ░ ▒  ▒   ░▒ ░ ▒░░░▒░ ░ ░ ░  ░      ░
 ░░   ░    ░    ░ ░  ░   ░░   ░  ░░░ ░ ░ ░      ░
  ░        ░  ░   ░       ░        ░            ░
                ░                                   `

const sections = [
  {
    content: chalk.red(header),
    raw: true
  },
  {
    header: 'Synopsis',
    content: [
      '$ example [{bold --timeout} {underline ms}] {bold --src} {underline file} ...',
      '$ example {bold --help}'
    ]
  }
]

console.log(getUsage(sections))
                
RESTful Web service
- [x] Examine code
- [ ] Commit fixes
- [ ] Request a review


**Labas**
